# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is used for gridmap SLAM. The interface is similar to gmapping (htt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure mrpt mrpt-bridge nav-msgs roscpp roslib rospy sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/kinetic/mrpt_rbpf_slam/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1e1ecd8dcccb5f44a81e6dae2d5c25c"
SRC_URI[sha256sum] = "4da565a39a6957de6b7ea14fc35af3e46708e22575c027b783dfb5bcba0ea440"
S = "${WORKDIR}/mrpt_slam-release-release-kinetic-mrpt_rbpf_slam-0.1.5-0"

inherit catkin
