# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=22;endline=22;md5=3b91e5c038b82a7cd68bc691a0162e6c"

DEPENDS = "catkin geometry_msgs libdmtx-dev message_filters resource_retriever roscpp sensor_msgs std_msgs visp visp_bridge visp_tracker zbar"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_auto_tracker/0.10.0-1.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "858340e873c59c5416ddfc7ad52ead29"
SRC_URI[sha256sum] = "e0d641be0a08f15d9e7a386451bae229fbc800bd3774fd295d81e6cfa49a04b7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
