# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Fiducial detection based on the aruco library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure fiducial-msgs image-transport opencv3 roscpp sensor-msgs tf2 tf2-geometry-msgs tf2-ros visualization-msgs"
SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/kinetic/aruco_detect/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aaef6f6f2954e0197f3b86f39e34eb83"
SRC_URI[sha256sum] = "4bf8c5d4badcec273864d7928deea0f7eb99de32fd2f76b478ab7c02ce115f49"
S = "${WORKDIR}/fiducials-release-release-kinetic-aruco_detect-0.7.5-0"

inherit catkin
