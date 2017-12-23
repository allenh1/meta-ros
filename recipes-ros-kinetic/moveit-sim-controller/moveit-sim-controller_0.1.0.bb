# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simulation interface for a hardware interface for ros_control, and loads defau"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-ros-planning ros-control-boilerplate roscpp roslint rosparam-shortcuts"
SRC_URI = "https://github.com/davetcoleman/moveit_sim_controller-release/archive/release/kinetic/moveit_sim_controller/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09a9063ca13d689cf8046416839ceb8f"
SRC_URI[sha256sum] = "c649a1a5f477802dd1d6cefca274a2dcf5c7928823b07658a67e0bed5243486c"
S = "${WORKDIR}/moveit_sim_controller-release-release-kinetic-moveit_sim_controller-0.1.0-0"

inherit catkin
