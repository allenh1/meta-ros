# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS node to build a 3D map of fiducials and estimate robot pose from fiducial tr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure fiducial-msgs image-transport opencv3 roscpp sensor-msgs tf2 tf2-geometry-msgs tf2-ros visualization-msgs"
SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/kinetic/fiducial_slam/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aacc9cefff659df473c74b4d25aea50d"
SRC_URI[sha256sum] = "879970a7ef73e11e0345ad8c4aac079bba9c5923280bd90d1085b243665e4ee5"
S = "${WORKDIR}/fiducials-release-release-kinetic-fiducial_slam-0.7.5-0"

inherit catkin
