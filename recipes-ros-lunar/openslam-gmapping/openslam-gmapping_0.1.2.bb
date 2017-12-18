# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-ified version of gmapping SLAM. Forked from https://openslam.informatik.uni-"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "CreativeCommons-by-nc-sa-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=11e24f757f025b2cbebd5b14b4a7ca19"

DEPENDS = "catkin-native catkin"
SRC_URI = "https://github.com/ros-gbp/openslam_gmapping-release/archive/release/lunar/openslam_gmapping/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfabbe29181f4b76643100e41521e32f"
SRC_URI[sha256sum] = "4d313b07c7c406753423e0c711c1630bebbccafc8dc5ce28232b2673436449a9"
S = "${WORKDIR}/openslam_gmapping-release-release-lunar-openslam_gmapping-0.1.2-0"

inherit catkin
