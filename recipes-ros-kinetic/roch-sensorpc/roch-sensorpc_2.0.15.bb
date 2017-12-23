# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ult/psd/cliff to pointcloud:     Publish Ult, cliff, and psd sensors events as p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet roch-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_sensorpc/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b9deb664a224231708b5bacd9d40c2d6"
SRC_URI[sha256sum] = "29855bf9e99615ad683b601ba8e8b3e180386cff168082aefb16f657cfe00f3a"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_sensorpc-2.0.15-0"

inherit catkin
