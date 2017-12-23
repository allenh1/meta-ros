# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some basic robot controllers for use with robot_controllers_interface."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs angles catkin-native control-msgs geometry-msgs kdl-parser nav-msgs orocos-kdl pluginlib robot-controllers-interface roscpp sensor-msgs std-msgs tf tf-conversions trajectory-msgs urdf"
SRC_URI = "https://github.com/fetchrobotics-gbp/robot_controllers-release/archive/release/kinetic/robot_controllers/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5ce07f5597380aed0d3f1f2e92b8413d"
SRC_URI[sha256sum] = "64f382f72f24426bdc2192019d42a9339b4222a42fc07af2679d604303e161e4"
S = "${WORKDIR}/robot_controllers-release-release-kinetic-robot_controllers-0.5.2-0"

inherit catkin
