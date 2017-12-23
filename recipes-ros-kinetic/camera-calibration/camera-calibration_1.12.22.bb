# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "camera_calibration allows easy calibration of monocular or stereo      cameras u"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-geometry message-filters rospy sensor-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/camera_calibration/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ae82007e49c1ef0181ce47e56ae0aa9"
SRC_URI[sha256sum] = "6c324b16f19a279546e35af5464869cba4da8d4b79dd9be39cf7ddc8d66d53c3"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-camera_calibration-1.12.22-0"

inherit catkin
