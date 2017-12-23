# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The agvs_gazebo package. Launch files and worlds to run Gazebo."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "agvs-description agvs-pad agvs-robot-control catkin-native effort-controllers gazebo-ros joint-state-controller roscpp std-msgs std-srvs tf velocity-controllers"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_sim-release/archive/release/kinetic/agvs_gazebo/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f87a3e46d2f26c1c5942c763ce61ecc6"
SRC_URI[sha256sum] = "6de0127434c711897d57f1bbe5aa0cbf02dc036056ecfd6685602fb364fdcc0e"
S = "${WORKDIR}/agvs_sim-release-release-kinetic-agvs_gazebo-0.1.3-0"

inherit catkin
