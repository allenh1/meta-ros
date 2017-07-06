# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin eigen_conversions eigen_stl_containers geometry_msgs graph_msgs libqt5x11extras5-dev roscpp roslint rviz sensor_msgs std_msgs tf_conversions trajectory_msgs visualization_msgs"
SRC_URI = "https://github.com/davetcoleman/rviz_visual_tools-release/archive/release/lunar/rviz_visual_tools/3.4.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "342db88c7e253dd8639f5dc97abecdbb"
SRC_URI[sha256sum] = "5d445d348f553165a8a6cacd153a5fd76edcc2b31b12c4c679122ebcea7ee5c5"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
