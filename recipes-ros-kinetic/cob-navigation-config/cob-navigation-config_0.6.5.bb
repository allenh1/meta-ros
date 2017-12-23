# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds common configuration files for running the   node and other n"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_navigation_config/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da10ab96b1afc7bd36a12ed9ad07e1a1"
SRC_URI[sha256sum] = "89a1fb6b0692f4f12cd8608105e247ff2fbe784897cb84d7cd35979c12d39777"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_navigation_config-0.6.5-0"

inherit catkin
