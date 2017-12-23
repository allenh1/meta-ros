# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SawYer roch Simulator bringup"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager gazebo-plugins gazebo-ros gazebo-ros-control hector-gazebo-plugins map-server pointcloud-to-laserscan robot-state-publisher roch-bringup roch-control roch-description roch-navigation roslaunch rostopic"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_simulator-release/archive/release/kinetic/roch_gazebo/2.0.12-5.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dac6feec1e2405b16930209899588a51"
SRC_URI[sha256sum] = "88c55b80ed78a07c61310f9b352a96f2511d7545002a82bacfad951afaab46ef"
S = "${WORKDIR}/roch_simulator-release-release-kinetic-roch_gazebo-2.0.12-5"

inherit catkin
