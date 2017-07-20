# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extracts checkerboard corners from a dense laser snapshot.      This package is "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib actionlib_msgs catkin cv_bridge image_cb_detector message_filters roscpp settlerlib std_msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/laser_cb_detector/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "331c3f8d442ccde1e2ffb5639a0b1314"
SRC_URI[sha256sum] = "8efb1704530c8485206815b70c0301f0606ae4ac9c2ec245debff3ba3ecad4d4"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
