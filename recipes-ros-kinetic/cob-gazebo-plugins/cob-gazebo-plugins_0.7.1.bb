# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_gazebo_plugins meta-package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-gazebo-ros-control"
SRC_URI = "https://github.com/ipa320/cob_gazebo_plugins-release/archive/release/kinetic/cob_gazebo_plugins/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7f67f6112c62778da5b39ed36fe28403"
SRC_URI[sha256sum] = "48255dd44ebc84ed825fc9bc14d02e4ea61948a1ef4c3776db0e53bac21d8795"
S = "${WORKDIR}/cob_gazebo_plugins-release-release-kinetic-cob_gazebo_plugins-0.7.1-0"

inherit catkin
