# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mrpt_icp_slam_2d contains a wrapper on MRPT's 2D ICP-SLAM algorithms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure mrpt mrpt-bridge nav-msgs roscpp roslib rospy sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/kinetic/mrpt_icp_slam_2d/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5195b9559782974f928d2462fddbac4d"
SRC_URI[sha256sum] = "3ff9c128e395d57faa66de75bc805072a2e6720c3faac6c88d5d556ddb783ab7"
S = "${WORKDIR}/mrpt_slam-release-release-kinetic-mrpt_icp_slam_2d-0.1.5-0"

inherit catkin
