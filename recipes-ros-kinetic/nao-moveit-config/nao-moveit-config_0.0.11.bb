# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher moveit-fake-controller-manager moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-simple-controller-manager nao-description robot-state-publisher xacro"
SRC_URI = "https://github.com/ros-naoqi/nao_moveit_config-release/archive/release/kinetic/nao_moveit_config/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0462965d530103acba9a9a503e42bb9f"
SRC_URI[sha256sum] = "d16e19059a41c598250059b89c579108bb8aa4ccb02db935eb1d94b9ba03dbad"
S = "${WORKDIR}/nao_moveit_config-release-release-kinetic-nao_moveit_config-0.0.11-0"

inherit catkin
