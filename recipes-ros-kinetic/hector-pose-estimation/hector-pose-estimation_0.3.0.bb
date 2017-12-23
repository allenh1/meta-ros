# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_pose_estimation provides the hector_pose_estimation node and the hector_p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs hector-pose-estimation-core message-filters nav-msgs nodelet sensor-msgs tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release/archive/release/kinetic/hector_pose_estimation/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0064d1a0d1a8510127bede6ce872acf"
SRC_URI[sha256sum] = "4ab12f770bed70b0f14ff7a20463f039d261279c70811b7ea3449ba1a66383b9"
S = "${WORKDIR}/hector_localization-release-release-kinetic-hector_pose_estimation-0.3.0-0"

inherit catkin
