# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapacakge that installs all available planners for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-planners-ompl"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c88d84033be1378edf248215fc08646c"
SRC_URI[sha256sum] = "965be621a9a795c1bf98b75f318957da81afaccb1bd27dc201387cfe8cb1bec2"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_planners-0.9.9-0"

inherit catkin
