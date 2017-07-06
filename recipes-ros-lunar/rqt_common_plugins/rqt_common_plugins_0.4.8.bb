# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_common_plugins metapackage provides ROS backend graphical tools suite that c"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=19;endline=19;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rqt_action rqt_bag rqt_bag_plugins rqt_console rqt_dep rqt_graph rqt_image_view rqt_launch rqt_logger_level rqt_msg rqt_plot rqt_publisher rqt_py_common rqt_py_console rqt_reconfigure rqt_service_caller rqt_shell rqt_srv rqt_top rqt_topic rqt_web"
SRC_URI = "https://github.com/ros-gbp/rqt_common_plugins-release/archive/release/lunar/rqt_common_plugins/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0aef125c48c4302284d3adf245a90c64"
SRC_URI[sha256sum] = "7d8916108b4faa12ebe98a42c97be3a685f11f69d17f5809c88e791cba29c9f1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
