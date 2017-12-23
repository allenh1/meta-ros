# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SawYer roch installation and integration package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "astra-launch catkin-native depthimage-to-laserscan diagnostic-aggregator freenect-launch imu-filter-madgwick imu-transformer laser-filters microstrain-3dmgx2-imu nmea-comms nmea-navsat-driver nodelet openni2-launch python-scipy realsense-camera rgbd-launch robot-localization robot-state-publisher robot-upstart roch-base roch-capabilities roch-control roch-description roch-safety-controller roch-sensorpc rocon-app-manager rocon-app-manager-msgs rocon-bubble-icons rocon-interaction-msgs roslaunch rospy rplidar-ros tf tf2-ros zeroconf-avahi"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_bringup/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "016652f980f0163b4bca5718126f7bdf"
SRC_URI[sha256sum] = "39a0f64bc0d30b4fd57b7bd086a138ce5171c1b97ed3cefda84c9370740ea509"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_bringup-2.0.15-0"

inherit catkin
