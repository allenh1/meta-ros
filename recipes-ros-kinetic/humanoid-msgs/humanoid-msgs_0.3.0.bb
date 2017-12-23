# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and services for humanoid robots"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/humanoid_msgs-release/archive/release/kinetic/humanoid_msgs/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65185b1351cb075d15a748130674a5f3"
SRC_URI[sha256sum] = "2c3e9b61c10aef451b3a82b45d659d95acfe526c3456be2849716a7c5ff151a3"
S = "${WORKDIR}/humanoid_msgs-release-release-kinetic-humanoid_msgs-0.3.0-0"

inherit catkin
