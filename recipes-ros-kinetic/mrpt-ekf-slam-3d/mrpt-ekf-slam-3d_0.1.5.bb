# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mrpt_ekf_slam_3d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & BSD & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure mrpt mrpt-bridge nav-msgs roscpp roslib rospy sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/kinetic/mrpt_ekf_slam_3d/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0119512b94904bc228fc7f2a8f427129"
SRC_URI[sha256sum] = "4a6d26314ff78daf91bf61676b3a4f613c2cad69fe62a07663208c7877a49762"
S = "${WORKDIR}/mrpt_slam-release-release-kinetic-mrpt_ekf_slam_3d-0.1.5-0"

inherit catkin
