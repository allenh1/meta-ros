# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SawYer Roch URDF description"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher roslaunch urdf xacro"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_description/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e26c9649243d1436be9bd12ad5d9b59"
SRC_URI[sha256sum] = "14d2a9581abd500c47276e48a1579c7aa203bc7e1b62b6dccec2b684bc5d8f55"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_description-2.0.15-0"

inherit catkin
