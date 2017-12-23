# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS node to detect fiducial markers and determine their pose"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native compressed-image-transport cv-bridge fiducial-lib fiducial-msgs fiducial-pose image-transport orocos-kdl roscpp sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros visualization-msgs"
SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/kinetic/fiducial_detect/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34f09eb4ac5e39538dbc4772a28ab5f3"
SRC_URI[sha256sum] = "0f2ff9f59e4f485d4f6c62ef3e070860694fc81bbd43faebc88c7a88eae87d67"
S = "${WORKDIR}/fiducials-release-release-kinetic-fiducial_detect-0.7.5-0"

inherit catkin
