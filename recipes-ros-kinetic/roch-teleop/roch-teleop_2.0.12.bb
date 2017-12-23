# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SawYer roch controller configurations"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diff-drive-controller geometry-msgs interactive-marker-twist-server joint-state-controller joint-trajectory-controller joy robot-localization roscpp roslaunch rostopic teleop-twist-joy twist-mux yocs-cmd-vel-mux"
SRC_URI = "https://github.com/SawYerRobotics-release/roch-release/archive/release/kinetic/roch_teleop/2.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f7c1ff16b299961728a637960a19c298"
SRC_URI[sha256sum] = "7058edefd5cfe296cfe9e21df4f1748b1d9cecba0e847a01ae6ecb73a6dfae05"
S = "${WORKDIR}/roch-release-release-kinetic-roch_teleop-2.0.12-0"

inherit catkin
