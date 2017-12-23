# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack holds packages for hardware configuration as well as launch files for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-bringup cob-default-robot-behavior cob-default-robot-config cob-hardware-config cob-moveit-config"
SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/kinetic/cob_robots/0.6.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "124ac9bdf4b2b257a19dfd602ca37936"
SRC_URI[sha256sum] = "1281cd99bc75d16ed6b41e286173a1bb98e7c5381f0a86bf1932789679ae1949"
S = "${WORKDIR}/cob_robots-release-release-kinetic-cob_robots-0.6.7-1"

inherit catkin
