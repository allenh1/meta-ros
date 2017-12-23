# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Sawyer Roch robot driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native controller-manager diagnostic-aggregator diagnostic-msgs diagnostic-updater diff-drive-controller geometry-msgs hardware-interface nodelet roch-control roch-description roch-msgs roscpp roslaunch roslint sensor-msgs std-msgs tf topic-tools"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_base/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a4c2699a712e5ad042e559600910ec25"
SRC_URI[sha256sum] = "69a3e2f5b61dae7b680d678c9610e2dbe1f31c375f8e15b61c6b978d97f3a280"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_base-2.0.15-0"

inherit catkin
