# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A more performance- and stability-oriented server alternative implemented     in"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rosserial-msgs rosserial-python std-msgs topic-tools"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_server/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da9492488b268916e2a2c2c9c4c68131"
SRC_URI[sha256sum] = "4105ece3ca8668fd5023e4cba8f0e90ed3428bd75b26e612640ab73d9221c52e"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_server-0.7.7-0"

inherit catkin
