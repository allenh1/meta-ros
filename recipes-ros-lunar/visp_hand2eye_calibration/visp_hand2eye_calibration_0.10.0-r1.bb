# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visp_hand2eye_calibration estimates the camera position with respect
     to its"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin geometry_msgs image_proc message_generation message_runtime roscpp sensor_msgs std_msgs visp visp_bridge"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_hand2eye_calibration/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9861f654a200d7cc08c8776163a5cb5"
SRC_URI[sha256sum] = "049a1c7885ba4342a432fd44c8f56ee5a6b23e59491feb34e0b564dc25503a69"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
