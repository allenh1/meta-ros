# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_gazebo package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros rbcar-control rbcar-description roscpp std-msgs std-srvs tf"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_sim-release/archive/release/kinetic/rbcar_gazebo/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9fed3295c6c5d317dab3fbc6128818e8"
SRC_URI[sha256sum] = "9316766fbf95b497271444a23ede60e6fd1093b4da8e866504a6e855fb2e7ac4"
S = "${WORKDIR}/rbcar_sim-release-release-kinetic-rbcar_gazebo-1.0.4-1"

inherit catkin
