# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mrpt_ekf_slam_2d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & BSD & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure mrpt mrpt-bridge nav-msgs roscpp roslib rospy sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/kinetic/mrpt_ekf_slam_2d/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65fc6ad791abc0884c2332c6ba2a754d"
SRC_URI[sha256sum] = "86eccbc267514012f844708fe4a54580b47fa97ed4c94ebbaae1602d5528d7cb"
S = "${WORKDIR}/mrpt_slam-release-release-kinetic-mrpt_ekf_slam_2d-0.1.5-0"

inherit catkin
