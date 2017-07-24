# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utility functions for displaying and debugging data in Rviz via published marker"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native eigen-conversions eigen-stl-containers geometry-msgs graph-msgs libqt5x11extras5-dev roscpp roslint rviz sensor-msgs std-msgs tf-conversions trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/davetcoleman/rviz_visual_tools-release/archive/release/lunar/rviz_visual_tools/3.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "342db88c7e253dd8639f5dc97abecdbb"
SRC_URI[sha256sum] = "5d445d348f553165a8a6cacd153a5fd76edcc2b31b12c4c679122ebcea7ee5c5"
S = "${WORKDIR}/rviz_visual_tools-release-release-lunar-rviz_visual_tools-3.4.1-0"

inherit catkin
