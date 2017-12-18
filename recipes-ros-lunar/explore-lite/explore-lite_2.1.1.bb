# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lightweight frontier-based exploration."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native catkin costmap-2d geometry-msgs map-msgs move-base-msgs nav-msgs roscpp std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/hrnr/m-explore-release/archive/release/lunar/explore_lite/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eaa077addcd32ec98f566f7cd5d43f0c"
SRC_URI[sha256sum] = "713a1a840aeb1c4dee126055de03ab11bc82ac9ff10d2c7d2cf778d0d273bfc9"
S = "${WORKDIR}/m-explore-release-release-lunar-explore_lite-2.1.1-0"

inherit catkin
