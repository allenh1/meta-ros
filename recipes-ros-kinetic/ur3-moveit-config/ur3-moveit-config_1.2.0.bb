# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher moveit-fake-controller-manager moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher ur-description xacro"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur3_moveit_config/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad5df4006992eaea238d9345e5c3ed96"
SRC_URI[sha256sum] = "9bc15eca2ac89e6a64165b41731aeee8b3834731b220cc979e6f0e1b725d6a3a"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur3_moveit_config-1.2.0-0"

inherit catkin
