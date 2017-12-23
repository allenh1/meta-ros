# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Drivers, description, and utilities for Universal Robot Arms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ur10-moveit-config ur3-moveit-config ur5-moveit-config ur-bringup ur-description ur-driver ur-gazebo ur-kinematics ur-msgs"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/universal_robot/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8024883fd0f0d6ddf5102a0b5016f4f3"
SRC_URI[sha256sum] = "e9598a90e78500776b61e350d5bd88f15a84534201dd8424135a51e200171c50"
S = "${WORKDIR}/universal_robot-release-release-kinetic-universal_robot-1.2.0-0"

inherit catkin
