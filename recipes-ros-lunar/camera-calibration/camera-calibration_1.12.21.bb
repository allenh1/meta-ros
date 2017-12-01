# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "camera_calibration allows easy calibration of monocular or stereo      cameras u"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-geometry message-filters rospy sensor-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/camera_calibration/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eda9912761fe0d1b8ed3b447bb620540"
SRC_URI[sha256sum] = "1f12a6d348ed10d8823c90dda7a7911af9c604847cc701d5dea7693e477b71e6"
S = "${WORKDIR}/image_pipeline-release-release-lunar-camera_calibration-1.12.21-0"

inherit catkin
