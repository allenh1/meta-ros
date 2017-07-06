# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "camera_calibration_parsers catkin cv_bridge eigen geometry_msgs image_geometry image_transport message_filters nav_msgs nodelet pkg-config roscpp rospy std_msgs swri_geometry_util swri_math_util swri_opencv_util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_image_util/0.3.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c9c976dd7940deb7657467d11d38d4a"
SRC_URI[sha256sum] = "f15129feb7981f9d0480e7960f33168d86ac7b65f53dc5be70787955c7253537"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
