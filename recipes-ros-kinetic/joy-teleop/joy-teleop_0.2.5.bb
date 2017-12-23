# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A (to be) generic joystick interface to control a robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native rospy rostopic sensor-msgs teleop-tools-msgs"
SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/kinetic/joy_teleop/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c8a2a415ffe2867236a13f0ca3d9d0d"
SRC_URI[sha256sum] = "b83d804b84c8d0521a5e1ea1a48d0b329d1833e1a8fb8de8ca36f62d64371e30"
S = "${WORKDIR}/teleop_tools-release-release-kinetic-joy_teleop-0.2.5-0"

inherit catkin
