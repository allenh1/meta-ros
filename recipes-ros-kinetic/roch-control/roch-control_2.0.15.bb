# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SawYer roch controller configurations"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager create-node diff-drive-controller geometry-msgs interactive-marker-twist-server joint-state-controller joint-trajectory-controller joy robot-localization roscpp roslaunch rostopic teleop-twist-joy twist-mux"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_control/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb5a23612ffd5b56f1127216a68ea9d9"
SRC_URI[sha256sum] = "00a6df72881a5a49c657a2990a1c148efec2b755919c5897f471e6d41ed3d55a"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_control-2.0.15-0"

inherit catkin
