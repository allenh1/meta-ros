# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This node does pose estimation for detected fiducials (marker_msgs/FiducialDetec"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-geometry marker-msgs roscpp rospy std-msgs tf"
SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/kinetic/tuw_marker_pose_estimation/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4019e4468dc6c8d17e6d1f2424a024fa"
SRC_URI[sha256sum] = "c826b79ad3a2f10d4d4807632e45eea163e49824a888f87271f6fc2e296cbf09"
S = "${WORKDIR}/tuw_marker_detection-release-release-kinetic-tuw_marker_pose_estimation-0.0.7-0"

inherit catkin
