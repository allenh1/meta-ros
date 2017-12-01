# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for embedded Linux enviroments"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_embeddedlinux/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5053bd5821307aeb62e1a3afeaf366a8"
SRC_URI[sha256sum] = "6afb12dae95c5be2cbbfd7156694dd92f9b22bb778288063278a9262c2148584"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_embeddedlinux-0.7.7-0"

inherit catkin
