# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement graphSLAM using the mrpt-graphslam library, in an online fashion   	by"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs mrpt mrpt-bridge mrpt-msgs nav-msgs roscpp rospy sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/kinetic/mrpt_graphslam_2d/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "72752b6f6e988c7211e99b96442cc265"
SRC_URI[sha256sum] = "d36ceafc6ae5edd7711d9d23ddb87692de6b08b0cd55a53821242a0b8d500a32"
S = "${WORKDIR}/mrpt_slam-release-release-kinetic-mrpt_graphslam_2d-0.1.5-0"

inherit catkin
