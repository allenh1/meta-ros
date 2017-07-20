# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "KDL binding for tf2"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake-modules eigen orocos-kdl tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_kdl/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc8e17dc84aef40feb619964bfe61bdd"
SRC_URI[sha256sum] = "2b072d5b8d1f6788735553b5a10088e7e8d4f17c9eae26f9fa46c34ebe2429f7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
