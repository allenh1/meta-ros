# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Capabilities for Roch"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet roch-base rocon-app-manager rocon-apps std-capabilities"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_capabilities/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "25f6e52b3118d48e749d4c93d48363a3"
SRC_URI[sha256sum] = "75f7da91dbfc6c84412daf4ef6968a905f7f5d6f6345750299723ae8bfbc36b4"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_capabilities-2.0.15-0"

inherit catkin
