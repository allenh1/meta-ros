# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library to estimate 3D pose with RosbustPlanarPose"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native fiducial-msgs geometry-msgs opencv3 roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/kinetic/fiducial_pose/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4b3af7e7e13b46790faa39cf30d6cb49"
SRC_URI[sha256sum] = "5414a0024aa7720b6b6b92a313ca34cf6aa329133a25c3b219ce39fa450f0631"
S = "${WORKDIR}/fiducials-release-release-kinetic-fiducial_pose-0.7.5-0"

inherit catkin
