# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Planning components of MoveIt that use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin dynamic-reconfigure eigen moveit-core moveit-ros-perception pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c188ddcfbfbeb7ddb94acab4b93090b3"
SRC_URI[sha256sum] = "b2bf6f2b1f286ea40b28960f17884a1481616f5c0de345fbe92d693061703269"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_planning-0.9.9-0"

inherit catkin
