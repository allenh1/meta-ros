# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic grasping applications and demos."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native cmake-modules geometry-msgs grasping-msgs message-generation message-runtime moveit-msgs moveit-python pcl-ros roscpp sensor-msgs shape-msgs tf"
SRC_URI = "https://github.com/fetchrobotics-gbp/simple_grasping-release/archive/release/kinetic/simple_grasping/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8380f592384929d6aace655791a7ffcf"
SRC_URI[sha256sum] = "7be19db8ffec57bdfa8de7cfbc121aa7ce703ef9e43bf4d9f8c5499448649059"
S = "${WORKDIR}/simple_grasping-release-release-kinetic-simple_grasping-0.2.2-0"

inherit catkin
