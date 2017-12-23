# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "control_msgs contains base messages and actions useful for     controlling robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/kinetic/control_msgs/1.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4092fc1d4cad53462142e5cdac5c2958"
SRC_URI[sha256sum] = "25047f1aaae57547310125bdd33c0932b2ae5c8cc69394f1bf92ebacdfd17297"
S = "${WORKDIR}/control_msgs-release-release-kinetic-control_msgs-1.4.0-0"

inherit catkin
