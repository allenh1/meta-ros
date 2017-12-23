# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscreate contains a tool that assists in the creation of ROS filesystem resourc"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b984c87b35580042f854cb15cc08cac"
SRC_URI[sha256sum] = "9f76e0611aa10a73144aa600e8855543be55462db775b9ecdd4cf5af3c6e1d9d"
S = "${WORKDIR}/ros-release-release-lunar-${PN}-1.14.2-0"

inherit catkin
