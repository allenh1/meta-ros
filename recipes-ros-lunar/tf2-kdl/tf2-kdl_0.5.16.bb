# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "KDL binding for tf2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cmake-modules eigen orocos-kdl tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_kdl/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc8e17dc84aef40feb619964bfe61bdd"
SRC_URI[sha256sum] = "2b072d5b8d1f6788735553b5a10088e7e8d4f17c9eae26f9fa46c34ebe2429f7"
S = "${WORKDIR}/geometry2-release-release-lunar-tf2_kdl-0.5.16-0"

inherit catkin
