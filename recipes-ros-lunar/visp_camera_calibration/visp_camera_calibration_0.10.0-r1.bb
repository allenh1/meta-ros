# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visp_camera_calibration allows easy calibration of
     cameras using a customiz"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=43dda7b18b8bc98d5c85e56e6dc7f10e"

DEPENDS = "camera_calibration_parsers catkin geometry_msgs message_generation message_runtime roscpp sensor_msgs std_msgs visp visp_bridge"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_camera_calibration/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c363848c825d003c1707a337c3c08044"
SRC_URI[sha256sum] = "b0668faf9ac6893beba5248dd55f2b5630ca00c99c1257fed6ea9202fb30e86c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
