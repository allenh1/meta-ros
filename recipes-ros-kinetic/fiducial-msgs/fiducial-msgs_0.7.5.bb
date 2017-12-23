# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing message definitions for fiducials"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/kinetic/fiducial_msgs/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1fbd4f3405419e90181f2bd7c0907ae"
SRC_URI[sha256sum] = "c94d9c52cfeab469a0a832d91c23746e1af35f5a356d933b72bb3e5384853bf1"
S = "${WORKDIR}/fiducials-release-release-kinetic-fiducial_msgs-0.7.5-0"

inherit catkin
