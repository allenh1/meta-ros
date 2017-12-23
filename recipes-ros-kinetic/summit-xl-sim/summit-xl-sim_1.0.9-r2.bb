# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The summit_xl_sim metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native summit-xl-control summit-xl-gazebo summit-xl-robot-control summit-xl-sim-bringup"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_sim-release/archive/release/kinetic/summit_xl_sim/1.0.9-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "90cf5c6611762a7eb1399ca1cb91f8ea"
SRC_URI[sha256sum] = "6e413eac43109cb0def73476358cf89fcc0231b8711b3f2d0d747ac78730986d"
S = "${WORKDIR}/summit_xl_sim-release-release-kinetic-summit_xl_sim-1.0.9-2"

inherit catkin
