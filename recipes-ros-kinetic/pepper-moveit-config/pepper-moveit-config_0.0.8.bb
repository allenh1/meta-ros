# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher moveit-fake-controller-manager moveit-planners-ompl moveit-ros-move-group moveit-simple-controller-manager pepper-description robot-state-publisher xacro"
SRC_URI = "https://github.com/ros-naoqi/pepper_moveit_config-release/archive/release/kinetic/pepper_moveit_config/0.0.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fab0af1b1228533470d6df198c09dc7b"
SRC_URI[sha256sum] = "3d757ea4412b9d35654889bfaad5f6301b558e759493e72ea49ccab1d5da6122"
S = "${WORKDIR}/pepper_moveit_config-release-release-kinetic-pepper_moveit_config-0.0.8-0"

inherit catkin
